# Calculator

- GitHubPagesでJavaのライブラリを公開するサンプルです

## ライブラリを公開する

```
mvn clean deploy
```

- deploy taskでdocsディレクトリに公開するライブラリが生成されます
- GitHubPagesで下記のように設定してdocsディレクトリを公開します

![image](https://user-images.githubusercontent.com/45971/228109458-a9099204-7975-47ce-8387-eae288294343.png)

## ライブラリを使う方法

### Maven

```xml
<repositories>
    <repository>
        <id>jp.co.plusvision.example</id>
        <url>https://bluerabbit.github.io/calculator/</url>
    </repository>
</repositories>

<dependency>
    <groupId>jp.co.plusvision.example</groupId>
    <artifactId>calculator</artifactId>
    <version>0.0.2</version>
</dependency>
```

### gradle

```groovy
repositories {
    maven { url 'https://bluerabbit.github.io/calculator/' }
}

dependencies {
    compile group:'jp.co.plusvision.example', name:'calculator', version:'0.0.2'
}
```
