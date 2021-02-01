now gradle's dependencies substitution can't correct share output KMP artifacts to other
 includeBuilds, so this repository now unusable. 

# Dependencies graph
![Alt text](https://g.gravizo.com/source/custom_mark10?https%3A%2F%2Fraw.githubusercontent.com%2Ficerockdev%2Fmoko%2Fmaster%2FREADME.md)
<details> 
<summary></summary>
custom_mark10
  digraph MOKO {
     graphics [label="moko-graphics"];
     parcelize [label="moko-parcelize"];
     resources [label="moko-resources"];
     mvvmCore [label="moko-mvvm-core"];
     mvvmLiveData [label="moko-mvvm-livedata"];
     units [label="moko-units",rank=0];
     unitsBasic [label="moko-units-basic"];
     fields [label="moko-fields"];
     permissions [label="moko-permissions"];
     media [label="moko-media"];
     geo [label="moko-geo"];
     errors [label="moko-errors"];
     paging [label="moko-paging"];
     network [label="moko-network"];
     networkErrors [label="moko-network-errors"];
     maps [label="moko-maps"];
     mapsGoogle [label="moko-maps-google"];
     mapsMapbox [label="moko-maps-mapbox"];
     socket [label="moko-socket-io"];
     crashReporting [label="moko-crash-reporting"];
     crashReportingCrashlytics [label="moko-crash-reporting-crashlytics"];
     crashReportingNapier [label="moko-crash-reporting-napier"];
     tensorflow [label="moko-tensorflow"];
     widgets [label="moko-widgets"];
     biometry [label="moko-biometry"];
     test [label="moko-test"]
     ranksep=1;
     {rank=same; graphics; parcelize; units; network; permissions; crashReporting; socket; mvvmCore; test}
     {rank=same; resources; media; geo; crashReportingCrashlytics; crashReportingNapier}
     {rank=same; mvvmLiveData; tensorflow; unitsBasic; maps; errors; biometry}
     {rank=same; networkErrors; paging; fields; mapsMapbox; mapsGoogle}
     resources -> graphics;
     resources -> parcelize;
     mvvmLiveData -> mvvmCore;
     mvvmLiveData -> resources;
     unitsBasic -> units;
     unitsBasic -> resources;
     unitsBasic -> graphics;
     fields -> mvvmLiveData;
     fields -> resources;
     media -> permissions;
     geo -> permissions;
     errors -> mvvmCore;
     errors -> resources;
     paging -> mvvmLiveData;
     maps -> geo;
     maps -> resources;
     maps -> graphics;
     mapsGoogle -> maps;
     mapsMapbox -> maps;
     tensorflow -> resources;
     widgets -> resources;
     widgets -> mvvmLiveData;
     widgets -> fields;
     widgets -> units;
     widgets -> graphics;
     widgets -> parcelize;
     networkErrors -> network;
     networkErrors -> errors;
     crashReportingCrashlytics -> crashReporting;
     crashReportingNapier -> crashReporting;
     biometry -> resources;
 }
custom_mark10
</details>
