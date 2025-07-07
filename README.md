# FileLogger

Quick file logger service

There are two methods:

1. logToFile(String path, String content)
   -you can give it either absolute or relative path, it doesn't matter
   -it will create any non existing subfolders if there is any
   -it will create a new file if it doesn't exist
   -at the end, it writes the content you sent it to file

2. appendToFIle(String path, String content)
   -the same as before, it checks all folders and files
   -at the end it writes data in append mode
