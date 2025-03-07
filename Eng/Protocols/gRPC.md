## gRPC

gRPC (Google Remote Procedure Call) is a high-performance framework for remote procedure calls (RPC) developed by Google. It is based on HTTP/2 and Protocol Buffers (protobuf) for data serialization, ensuring fast and efficient communication between services.

![Alt текст](/img/protocols/grpc.jpg)
### Why use gRPC?
✅ 1. High Performance
✔ Uses HTTP/2, which reduces network overhead compared to REST.
✔ Binary serialization with Protocol Buffers (protobuf) instead of JSON.

✅ 2. Supports Streaming
✔ Supports unidirectional and bidirectional streaming (great for chats, video calls).
✔ REST does not support streaming efficiently.

✅ 3. Multi-language Support
✔ gRPC supports Java, Python, Go, C++, JavaScript, C#, Kotlin, and more.
✔ Ideal for multi-language microservices.

✅ 4. Automatic Code Generation
✔ Uses protobuf to automatically generate client and server SDKs.
✔ No need to manually write REST API clients.

### Types of gRPC Calls
- Unary RPC (Request-Response, like REST)
📌 The client sends a single request, and the server responds with a single response.

```
rpc GetUser (UserRequest) returns (UserResponse);
```
- Server Streaming RPC
📌 The server streams multiple responses back to the client for a single request.
✔ Useful for logs, notifications, or real-time updates.

```
rpc ListUsers (UserFilter) returns (stream User);
```
- Client Streaming RPC
📌 The client sends multiple messages, and the server responds once.
✔ Useful for file uploads or batch data processing.

```
rpc SendLogs (stream LogMessage) returns (LogResponse);
```
- Bi-directional Streaming RPC
📌 Both the client and server send messages continuously in real time.
✔ Useful for chats, video calls, and IoT.

```
rpc Chat (stream ChatMessage) returns (stream ChatMessage);
```