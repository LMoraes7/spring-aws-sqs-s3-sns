provider "aws" {
    region                      = "us-east-1"
    access_key                  = "fake"
    secret_key                  = "fake"
    skip_credentials_validation = true
    skip_requesting_account_id  = true
    skip_metadata_api_check     = true
    
    endpoints {
        sqs = "http://localhost:4566"
    }
}

resource "aws_sqs_queue" "queue" {
    name = var.sqs_name
}