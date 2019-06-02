NeoCat
=========
NeoCat is a practing project which is based on Tomcat9.


how-to-build
============
mvn, Eclipse or IDEA


how-to-run
============
Bootstrap.java->Debug/Run


version
=========
1. Update tomcat9 project to mvn project, keeping all the code, remove some unnecessary file.
2. Remove naming, cluster, ant, ejb, ssi, cgi, mbeans.
3. Remove modeler, fileupload, dbcp, ajp. Replace juli with slf4j.
4. Remove buildutil, jni, tagplugins.jstl, SSO, jaspic, json, and some javax. Add idea support.

