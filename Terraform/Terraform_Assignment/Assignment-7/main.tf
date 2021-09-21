terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 3.0"
    }
  }
}

provider "aws" {
    
    region = "${var.aws_region}"
}

resource "random_id" "tf_bucket_id" {
  byte_length = 2
  count = var.number_of_instances
}

resource "aws_s3_bucket" "tf_code" {
    count = var.number_of_instances
    bucket        = "${var.project_name}-${random_id.tf_bucket_id[count.index].dec}"
    acl           = "private"

    force_destroy =  true

    tags = {
      Name = "tf_bucket-${count.index}"
    }
}