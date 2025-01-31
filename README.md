# Single-Threaded Web Server

## Overview
This project implements a simple single-threaded client-server communication in Java. The server listens for client connections on port `8080`, accepts a message from the client, and responds back with a greeting.

## How It Works
1. **Server:** Listens on port `8080`, accepts connections, reads messages from the client, and responds.
2. **Client:** Connects to the server, sends a message, and prints the response from the server.

## Running the Project
1. **Compile the files:**
   ```sh
   javac Server.java Client.java
   ```
2. **Start the server:**
   ```sh
   java Server
   ```
3. **Run the client in a separate terminal:**
   ```sh
   java Client
   ```

## Expected Output
**Server Output:**
```
Server Is listening on port 8080
Connection accepted from /127.0.0.1:XXXXX
Message from client: Hello Server from client
```

**Client Output:**
```
Response from server is : Hello Client from server
```

**Should look like this**

![Screenshot (7)](https://github.com/user-attachments/assets/2598b39d-9947-4589-8acc-d56381e2feb6)


## Requirements
- Java 8 or later

👤 **Kandarp Joshi**

* Github: [@Kandarp Joshi](https://github.com/KandarpJoshi1112)
* LinkedIn: [@Kandarp Joshi](https://www.linkedin.com/in/kandarp-joshi-3451231bb/)

Enjoy coding! 🚀

