package com.rackspacecloud.blueflood.io;

import com.google.common.base.Supplier;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.rackspacecloud.blueflood.io.MetadataIO;
import com.rackspacecloud.blueflood.test.CassandraUtilsIO;
import com.rackspacecloud.blueflood.types.Locator;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class InMemoryMetadataIO implements MetadataIO, CassandraUtilsIO {
    public final Table<Locator, String, String> backingTable = Tables.newCustomTable(
            Maps.<Locator, Map<String, String>>newHashMap(),
            new Supplier<Map<String, String>>() {
                @Override
                public Map<String, String> get() {
                    return Maps.newHashMap();
                }
            }
    );

    @Override
    public void put(Locator locator, String key, String value) throws IOException {
        backingTable.put(locator, key, value);
    }

    @Override
    public Map<String, String> getAllValues(Locator locator) throws IOException {
        return backingTable.row(locator);
    }

    @Override
    public Table<Locator, String, String> getAllValues(Set<Locator> locators) throws IOException {
        Table<Locator, String, String> results = HashBasedTable.create();

        for (Locator locator : locators) {
            Map<String, String> metaForLoc = backingTable.row(locator);
            for (Map.Entry<String, String> meta : metaForLoc.entrySet()) {
                results.put(locator, meta.getKey(), meta.getValue());
            }
        }

        return results;
    }

    @Override
    public void putAll(Table<Locator, String, String> meta) throws IOException {
        backingTable.putAll(meta);
    }

    @Override
    public long getKeyCount( String cf ) throws Exception {
        return backingTable.rowKeySet().size();
    }

    @Override
    public void truncateColumnFamily ( String cf ) throws Exception {
        backingTable.clear();
    }
}
