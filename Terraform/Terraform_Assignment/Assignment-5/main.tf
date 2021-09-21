terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "2.15.0"
    }
  }
}

provider "docker" {
  host = "npipe:////.//pipe//docker_engine"
}

resource "docker_container" "mysql_container" {
  name = var.container_name
  image = docker_image.mysql_image.latest
  env = [ 
      "MYSQL_ROOT_PASSWORD=${var.mysql_root_password}", 
  ]
  volumes {
      volume_name = docker_volume.mysql_data_volume.name
      container_path = "/var/lib/mysql"
  }
  networks_advanced {
    name = docker_network.private_bridge_network.name
  }
}

