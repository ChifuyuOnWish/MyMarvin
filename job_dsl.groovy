job('Disk Space Check') {
    steps {
        shell('df -h')
    }
}

job('Daily Dose of Satisfaction') {
    parameters {
        stringParam('NAME', "user")
    }
    steps {
        shell('echo "Hello dear $NAME!"')
        shell('date')
        shell('echo "Your DDoS number is $BUILD_NUMBER"')
    }
}
