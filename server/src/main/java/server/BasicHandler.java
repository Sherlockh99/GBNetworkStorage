package server;

import client.dto.AuthRequest;
import client.dto.BasicRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import server.dto.BasicResponse;
import server.dto.GetFileListRequest;

public class BasicHandler extends ChannelInboundHandlerAdapter {

    private String clientName;
    private static int newClientIndex = 0;
    private final static BasicResponse LOGIN_BAD_RESPONSE = new BasicResponse("login bad");
    private final static BasicResponse LOGIN_OK_RESPONSE = new BasicResponse("login ok");

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        //newClientIndex++;
        clientName = "Клиент подключился № " + (++newClientIndex);
        System.out.println(clientName);

        System.out.println(ctx.channel().remoteAddress());
    }

    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {
        BasicRequest request = (BasicRequest) msg;
        System.out.println(request.getType());

        if (request instanceof AuthRequest) {
            AuthRequest authRequest = (AuthRequest) request;
            if (authRequest.getLogin().equals("S")){
                channelHandlerContext.writeAndFlush(LOGIN_OK_RESPONSE);
            }else {
                channelHandlerContext.writeAndFlush(LOGIN_BAD_RESPONSE);
            }
        } else if (request instanceof GetFileListRequest) {
            BasicResponse basicResponse = new BasicResponse("file list....");
            channelHandlerContext.writeAndFlush(basicResponse);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println(clientName + " отключился");
        ctx.close();
        //cause.printStackTrace();
    }
}
