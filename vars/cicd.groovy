def gitdownload(repo)
{
  git "https://github.com/Sandeeppappula/${repo}.git"
}
def gitbuild()
{
  sh "mvn package"
}
def gitdeploy(ipaddress,contextpath)
{
  sh "scp ${WORKSPACE}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${contextpath}.war"
}
def gittesting(repo)
{
  git "https://github.com/Sandeeppappula/${repo}.git"
  sh "java -jar ${WORKSPACE}/testing.jar"
}
def gitdelivary(ipaddress,contextpath)
{
    sh "scp ${WORKSPACE}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${contextpath}.war"
}
