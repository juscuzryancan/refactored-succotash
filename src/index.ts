import express from "express";
import { createServer } from "http";
import { Server } from "socket.io";
import { instrument } from "@socket.io/admin-ui";

const app = express();
const httpServer = createServer(app);
const io = new Server(httpServer, { 
  cors: { origin: "*"},
});

io.on("connection", (socket) => {
  socket.on("message", (data) => {
    socket.broadcast.emit("receiveMessage", `Socket id: ${socket.id} sends: ${data}`);
  })
});

httpServer.listen(3000);
console.log("listening on 3000");
