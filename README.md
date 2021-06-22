# wordcount
MapReduce demo
统计单词demo
1.在linux系统上创建一个文件
vim  /data/file 输入内容为jiang zhang li jiang zhang
2.将文件上传到Hadoop文件系统种
hadoop fs -moveFromLocal ./file /test/
3.执行统计结果
hadoop jar /data/jar/wordcount.jar com.demo.WordCount /test/file /test/fileoutput
