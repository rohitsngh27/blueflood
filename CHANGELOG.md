* [](http://github.com/rohitsngh27/blueflood/commit/642c2fd7285d8ed23e000db9d5c5bc63fd564ad7) - [maven-release-plugin] prepare release blueflood-3.5.0
* [](http://github.com/rohitsngh27/blueflood/commit/e8301ed871f61e79b24109e0f0b54ec1fcb54bbc) - Ignored failing testcases which is intermitent
* [](http://github.com/rohitsngh27/blueflood/commit/c09bc96d38d6591fc970944d43bda912dd8fc17f) - Merge pull request #915 from rax-maas/ignoring_failing_testcases
* [](http://github.com/rohitsngh27/blueflood/commit/e3750d0271a44c4753fbcc1ce1641ac1b78f4c4b) - Ignoring failing test cases
* [](http://github.com/rohitsngh27/blueflood/commit/cdc6a8d1a8899cf111cb5563f48254af08cb028e) - Merge pull request #916 from rax-maas/ignoring_failing_testcases
* [](http://github.com/rohitsngh27/blueflood/commit/d6ba97ce9a2ea91a9a442fc083e076bbee50b0f9) - Ignoring poison test case
* [](http://github.com/rohitsngh27/blueflood/commit/4a60be9b24d3ed6a6ee1a8586c743e68b9e491b0) - Merge branch 'master' of https://github.com/rackerlabs/blueflood into HEAD
* [](http://github.com/rohitsngh27/blueflood/commit/701cd6490202445565f9d2db70e37c8de285c576) - Uncommented test cases
* [](http://github.com/rohitsngh27/blueflood/commit/28477bac7f40b947de4e8ca4d4a65122fb5dc43a) - Update unit-test.yml
* [](http://github.com/rohitsngh27/blueflood/commit/35e180078b70f462ffce83a581955a2cccafe7d3) - Update unit-test.yml
* [](http://github.com/rohitsngh27/blueflood/commit/8c6c0d76e4e0bc917f0fd7a86ebf7ca25af25ae9) - changed token getting used to create PR
* [](http://github.com/rohitsngh27/blueflood/commit/46f03c9befcaf2fb707417441e4fb4de4036ac8c) - Merge pull request #919 from rax-maas/pr_token_change
* [](http://github.com/rohitsngh27/blueflood/commit/9045c13d49b7c55c96f413fe5f15f72cea81b679) - let env vars set config properties
* [](http://github.com/rohitsngh27/blueflood/commit/5245418ad3e5e8b300eb0a095b41caf69ac96231) - let Docker container start without initting
* [](http://github.com/rohitsngh27/blueflood/commit/263da4b30248e23fd0d38340e768437ad694d0c4) - Merge pull request #921 from rax-maas/docker-init-optional
* [](http://github.com/rohitsngh27/blueflood/commit/788dafb17b4eb10e8f4f16e6a0b3225d9b262856) - make ES init script more friendly and informational
* [](http://github.com/rohitsngh27/blueflood/commit/fd41cb3d155847af2c2dc13f970d2779c4fd4098) - decide to use ADRs
* [](http://github.com/rohitsngh27/blueflood/commit/3bffbd5476de71b0032c4aeb23d269c2af69b5ee) - Merge pull request #920 from rax-maas/config-takes-env-vars
* [](http://github.com/rohitsngh27/blueflood/commit/f151d5bba9756b8ea68d6e253f26ae3539a2a455) - Merge pull request #922 from rax-maas/init-es-touchup
* [](http://github.com/rohitsngh27/blueflood/commit/7f38cc8d6e393f7f6eb8f004b2991f914615c6ba) - allow docker image to take config files
* [](http://github.com/rohitsngh27/blueflood/commit/23df33decabbbb23ede7ae38c5695efc12b890fa) - remove git from docker image
* [](http://github.com/rohitsngh27/blueflood/commit/c3c4d0a8f46f63842996548f6d8d8c3a532b0343) - Merge pull request #924 from rax-maas/docker-image-config
* [](http://github.com/rohitsngh27/blueflood/commit/b69cdb96aec30d8f62da6df1bfe87443d1b3511b) - Merge pull request #925 from rax-maas/docker-git-removal
* [](http://github.com/rohitsngh27/blueflood/commit/8548ca7f7461c5e6b3d70b0798199e6ff6073fcc) - Merge pull request #923 from rax-maas/adopt-adr
* [](http://github.com/rohitsngh27/blueflood/commit/22f8beaedf215c4d150bbe0e80001adba314d302) - [maven-release-plugin] prepare release blueflood-2.1.0
* [](http://github.com/rohitsngh27/blueflood/commit/1bdad9fd9404743ade3eb3353fb3e35ec39eeab6) - [maven-release-plugin] prepare for next development iteration
* [](http://github.com/rohitsngh27/blueflood/commit/fc271042c92a4d11703e8d4b717c89fcc16a2466) - Merge pull request #926 from rax-maas/release/2.1.0
* [](http://github.com/rohitsngh27/blueflood/commit/3ed455c8518a7d9e440ca804ef34ab6d962f65eb) - Added fix for failing integration test cases. There were 4 integration tests which are failing regularly. So Added following fix for those: 1. There was one poison test case  which was not asserting anything and was modifying static instance MetadataCache to use InMemoryDataIo object. This results in failure of few test cases. So, Ignoring this test case for now and will revisit it to add some meaningful implementation for the same. 2. Added a sleep and retry mechanism in two of the test cases as data was not present in first try. 3. ElasticIoIntegrationTest was failing in setup of elastic search when it tries to create metric_metadata index. So added one line of code to remove everything before creating any indexes.
* [](http://github.com/rohitsngh27/blueflood/commit/3ea3b50719486bd3c5b75b06f83af69d326c17bd) - Merge pull request #927 from rax-maas/rohit/CMC-2395-Fix-integration-test-cases
* [](http://github.com/rohitsngh27/blueflood/commit/5d9f7b799820963aa0fd42fe0cc620b69bb4ec48) - Resolved conflicts
* [](http://github.com/rohitsngh27/blueflood/commit/d0c7b4c0c6514d84d769928a9da79c9f90bf4416) - Update release.yml
* [](http://github.com/rohitsngh27/blueflood/commit/e6b745497bb19491ecb6d261d309dd2cb5339179) - Update release.yml

