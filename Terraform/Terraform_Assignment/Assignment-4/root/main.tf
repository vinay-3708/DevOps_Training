module "ghost" {
  source = "C:/Users/nanda/Desktop/New_folder/Terraform/Terraform/Assignment-4/Ghost"  
  image_name = "${var.image_name}"
  container_name = "${var.container_name}"
  ext_port = "${var.ext_port}"
}