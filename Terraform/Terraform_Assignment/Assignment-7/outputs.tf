output "bucketname" {
  value = join(",",[aws_s3_bucket.tf_code[0].id,aws_s3_bucket.tf_code[1].id])
}