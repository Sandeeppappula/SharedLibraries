def gitdownload(repo)
{
  git "https://github.com/Sandeeppappula/${repo}.git"
}
def gitbuild()
{
  sh "mvn package"
}
def gitdeploy(jobname,ipaddress,contextpath)
{
  sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${contextpath}'
}
