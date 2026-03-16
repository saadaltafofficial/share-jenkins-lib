def call() {
    sh '''
        trivy fs . \
            --exit-code 0 \
            --severity HIGH,CRITICAL \
            --format table \
            --output trivy-fs-report.txt || true
        cat trivy-fs-report.txt
    '''
}
