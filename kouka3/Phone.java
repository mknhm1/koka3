// Phoneクラス
public class Phone {
    
    // Samsun関連の情報を表示するメソッド
    public void Samsun() {
        // Samsunクラスのインスタンスを作成
        Samsun Samsun = new Samsun();
        
        // Galaxyシリーズの各年の情報を表示
        Samsun.galaxyUltra2023();
        Samsun.galaxyUltra2022();
        Samsun.galaxyUltra2021();
        Samsun.galaxyUltra2020();

        Samsun.galaxynote2019();
        Samsun.galaxynote2018();
        Samsun.galaxynote2017();

        Samsun.galaxyfold2023();
        Samsun.galaxyfold2022();
        Samsun.galaxyfold2021();
        Samsun.galaxyfold2020();
        Samsun.galaxyfold2019();

        Samsun.galaxyflip2023();
        Samsun.galaxyflip2022();
        Samsun.galaxyflip2021();
        Samsun.galaxyflip2020();
        Samsun.galaxyflip2019();

        Samsun.galaxy2023();
        Samsun.galaxy2022();
        Samsun.galaxy2021();
        Samsun.galaxy2020();
        Samsun.galaxy2019();
        Samsun.galaxy2018();
    }
    
    // Sony関連の情報を表示するメソッド
    public void Sony() {
        // Sonyクラスのインスタンスを作成
        Sony sony = new Sony();
        
        // Xperiaシリーズの各年の情報を表示
        sony.xperia2023();
        sony.xperia2022();
        sony.xperia2021();
        sony.xperia2020();
        sony.xperia2019();
    }
    
    // Apple関連の情報を表示するメソッド
    public void Apple() {
        // Appleクラスのインスタンスを作成
        Apple apple = new Apple();
        
        // iPhoneシリーズの各年の情報を表示
        apple.iPhone2023();
        apple.iPhone2022();
        apple.iPhone2021();
        apple.iPhone2020();
        apple.iPhone2019();
        apple.iPhone2018();
    }

    // 以下は各年ごとの携帯電話モデルに関する情報を表示するメソッド

    public void year23() {
        Samsun Samsun = new Samsun();
        Sony sony = new Sony();
        Apple apple = new Apple();

        // 各メーカーの2023年モデルの情報を表示
        Samsun.galaxyUltra2023();
        Samsun.galaxyfold2023();
        Samsun.galaxyflip2023();
        Samsun.galaxy2023();
        sony.xperia2023();
        apple.iPhone2023();
    }

    public void year22() {
        Samsun Samsun = new Samsun();
        Sony sony = new Sony();
        Apple apple = new Apple();

        // 各メーカーの2022年モデルの情報を表示
        Samsun.galaxyUltra2022();
        Samsun.galaxyfold2022();
        Samsun.galaxyflip2022();
        Samsun.galaxy2022();
        sony.xperia2022();
        apple.iPhone2022();
    }

    public void year21() {
        Samsun Samsun = new Samsun();
        Sony sony = new Sony();
        Apple apple = new Apple();

        // 各メーカーの2021年モデルの情報を表示
        Samsun.galaxyUltra2021();
        Samsun.galaxyfold2021();
        Samsun.galaxyflip2021();
        Samsun.galaxy2022();
        Samsun.galaxy2021();
        sony.xperia2021();
        apple.iPhone2021();
    }

    public void year20() {
        Samsun Samsun = new Samsun();
        Sony sony = new Sony();
        Apple apple = new Apple();

        // 各メーカーの2020年モデルの情報を表示
        Samsun.galaxyUltra2020();
        Samsun.galaxyfold2020();
        Samsun.galaxyflip2020();
        Samsun.galaxy2020();
        sony.xperia2020();
        apple.iPhone2020();
    }

    public void year19() {
        Samsun Samsun = new Samsun();
        Sony sony = new Sony();
        Apple apple = new Apple();

        // 各メーカーの2019年モデルの情報を表示
        Samsun.galaxynote2019();
        Samsun.galaxyfold2019();
        Samsun.galaxyflip2019();
        sony.xperia2019();
        apple.iPhone2019();
    }

    public void year18() {
        Samsun Samsun = new Samsun();
        Sony sony = new Sony();
        Apple apple = new Apple();

        // 各メーカーの2018年モデルの情報を表示
        Samsun.galaxy2018();
        apple.iPhone2018();
    }

    public void year17() {
        Samsun Samsun = new Samsun();
        Sony sony = new Sony();
        Apple apple = new Apple();

        // 各メーカーの2017年モデルの情報を表示
        Samsun.galaxy2017();
    }
}
