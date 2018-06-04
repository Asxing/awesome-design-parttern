package com.holddie.design.concretecommand;

import com.holddie.design.command.AbstractCommand;
import com.holddie.design.command.Command;
import com.holddie.design.receiver.FileSystemReceiver;

/**
 * 写文件命令类
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/4 10:37
 */
public class WriteFileCommand extends AbstractCommand implements Command {
    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        super(fileSystemReceiver);
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
