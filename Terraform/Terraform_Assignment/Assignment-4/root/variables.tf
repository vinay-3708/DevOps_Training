variable "image_name" {
  default = "ghost:latest"
  description = "Image for container"
}

variable "container_name" {
    default = "blogwith"
    description = "Name of the Container"
  
}

variable "ext_port" {
    default = 80
    description = "External port for container"
  
}