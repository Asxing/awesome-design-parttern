package com.holddie.design;

import com.holddie.design.concretecommand.CloseFileCommand;
import com.holddie.design.concretecommand.OpenFileCommand;
import com.holddie.design.concretecommand.WriteFileCommand;
import com.holddie.design.invoker.FileInvoker;
import com.holddie.design.receiver.FileSystemReceiver;
import com.holddie.design.util.FileSystemReceiverUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // 打开文件
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        // 写文件
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        FileInvoker fileInvoker1 = new FileInvoker(writeFileCommand);
        fileInvoker1.execute();

        // 关闭文件
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        FileInvoker fileInvoker2 = new FileInvoker(closeFileCommand);
        fileInvoker2.execute();

    }
}
