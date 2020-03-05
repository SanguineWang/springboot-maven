# 作业二
##### 1 为以下方法编写一个测试类，多个测试用例。答案直接复制类的全部代码，必须使用断言！
    
    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;
    public class FileUtils {
        /**
         * 获取指定文件大小
         * @param path
         * @return
         */ 
        public static long getSize(Path path) {
            try {
                return Files.size(path);
            } catch (IOException e) {
                throw new RuntimeException(""操作错误！无法对指定文件执行操作"");
            }
        }
    }
##### 2 基于lombok与slf4j的占位符，为以下方法分支，打一个测试输出输出结果类似：输入: BO，长度小于5
````
    public void get(String name) {
        int length = 5;
        if (name.length() <= length) {
        /**
        *  填写代码
        */
        }
    }
````
