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
  sh "scp /var/lib/jenkins/workspace/${JOB_NAME}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${contextpath}.war"
}
def gittesting(repo,jobname)
{
  git "https://github.com/Sandeeppappula/${repo}.git"
  sh "java -jar ${WORKSPACE}/${JOB_NAME}/testing.jar"
}
def gitdelivary(ipaddress,contextpath)
{
    sh "scp /var/lib/jenkins/workspace/${JOB_NAME}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${contextpath}.war"
}
