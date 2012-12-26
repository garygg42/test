Starting the Service
---------------------------------------
  * Add maven URL into karaf:
features:addurl mvn:org.talend.esb.examples.osgi-soap-parsestring/features/5.3.0-SNAPSHOT/xml

  * Install example feature in container:
features:install tesb-osgi-parsestring
