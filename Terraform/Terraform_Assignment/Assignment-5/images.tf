

# Download the latest Ghost Image
resource "docker_image" "mysql_image" {
  name = "mysql:5.7"
}
