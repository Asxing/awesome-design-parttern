package com.holddie.design.concretecommand;

import com.holddie.design.command.AbstractCommand;
import com.holddie.design.command.Command;
import com.holddie.design.receiver.FileSystemReceiver;

/**
 * 打开文件命令
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/4 10:33
 */
public class OpenFileCommand extends AbstractCommand implements Command {

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        super(fileSystemReceiver);
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
