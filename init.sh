!# /bin/bash

sudo yum -yq install git maven
git clone https://github.com/jevora/tscd-factorial.git
cd tscd-factorial/
mvn clean package -q
cd ..