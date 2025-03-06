FROM jenkins/jenkins:lts
USER root
RUN jenkins-plugin-cli --plugins configuration-as-code job-dsl
