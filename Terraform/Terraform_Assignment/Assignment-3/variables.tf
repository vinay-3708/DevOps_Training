#Define variables
variable "image_name" {
  description = "Image for container."
  type = map
  default = { dev = "ghost:latest", prod = "ghost:alpine"}
}

variable "container_name" {
  type = map
  description = "Name of the container."
  default     = { dev = "blog_dev",prod = "blog_prod" }
}

variable "ext_port" {
  type = map
  description = "External port for container."
  default     = { dev = 8080, prod = 80 }
}

variable "env" {
  description = "env: dev or prod"
  
}