# Read from the file file.txt and output all valid phone numbers to stdout.
#!/bin/bash

cat file.txt | grep -P '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$'
