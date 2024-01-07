# frontend server output file

output "frontend_public_ip" {
  value = aws_instance.frontend.public_ip
}

output "frontend_public_dns" {
  value = aws_instance.frontend.public_dns
}


# predefined username, while we giving ami id in server configuration we will know this

output "backend_server_username" {
  value = "ubuntu"  # Replace with your instance username if different
}