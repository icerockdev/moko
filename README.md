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
     mvvm [label="moko-mvvm"];
     units [label="moko-units",rank=0];
     unitsBasic [label="moko-units-basic"];
     fields [label="moko-fields"];
     permissions [label="moko-permissions"];
     media [label="moko-media"];
     geo [label="moko-geo"];
     errors [label="moko-errors"];
     paging [label="moko-paging"];
     network [label="moko-network"];
     maps [label="moko-maps"];
     mapsGoogle [label="moko-maps-google"];
     mapsMapbox [label="moko-maps-mapbox"];
     socket [label="moko-socket-io"];
     crashReporting [label="moko-crash-reporting"];
     crashReportingCrashlytics [label="moko-crash-reporting-crashlytics"];
     crashReportingNapier [label="moko-crash-reporting-napier"];
     tensorflow [label="moko-tensorflow"];
     widgets [label="moko-widgets"];
     ranksep=1;
     {rank=same; graphics; parcelize; units; network; permissions; crashReporting; socket}
     {rank=same; resources; media; geo; crashReportingCrashlytics; crashReportingNapier}
     {rank=same; mvvm; tensorflow; unitsBasic; maps}
     {rank=same; errors; paging; fields; mapsMapbox; mapsGoogle}
     resources -> graphics;
     resources -> parcelize;
     mvvm -> resources;
     unitsBasic -> units;
     unitsBasic -> resources;
     unitsBasic -> graphics;
     fields -> mvvm;
     fields -> resources;
     media -> permissions;
     geo -> permissions;
     errors -> mvvm;
     errors -> resources;
     paging -> mvvm;
     maps -> geo;
     maps -> resources;
     maps -> graphics;
     mapsGoogle -> maps;
     mapsMapbox -> maps;
     tensorflow -> resources;
     widgets -> resources;
     widgets -> mvvm;
     widgets -> fields;
     widgets -> units;
     widgets -> graphics;
     widgets -> parcelize;
     crashReportingCrashlytics -> crashReporting;
     crashReportingNapier -> crashReporting;
 }
custom_mark10
</details>
