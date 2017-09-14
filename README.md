# dcpChat
### 環境構築方法(Mac)
1. [Homebrew](https://brew.sh/index_ja.html)を導入する
1. [Docker](https://www.docker.com/docker-mac)をインストールする
1. brew経由でDocker, Docker-Composeをインストールする。※参考: [Docker環境をHomebrewで手軽に作成](http://qiita.com/digitalm/items/49b7099554bdbff5ed8e)
1. 当プロジェクトをCloneする
1. eclipseに「EGradle」のpluginを追加する。
　　　　　　[Help]→[Eclipse MarketPlace]→検索欄に[EGradle]を検索する→[EGradle 2.1.0]をインストールする。
1. IDEにて当プロジェクトをimportする　※Eclipseは[Spring Sts](http://qiita.com/Siro/items/4efea6e9ce6bf2961b36)をインストールしてください
　　※この際、Gradleプロジェクトとしてimportしてください
 ※import時には[EGradle]を使ってimportしてください
1. ターミナル等でプロジェクトのルートへ移動後、 `docker-compose build` → `docker-compose up -d`　(DB, Redisが立ち上がる)
→完了

### 環境構築方法(Windows)
1. [Docker-ToolBox](https://docs.docker.com/toolbox/toolbox_install_windows/)をインストール　
1. [Bash on Ubuntu on Windows](http://qiita.com/Aruneko/items/c79810b0b015bebf30bb)をインストール→起動
1. 当プロジェクトをCloneする
1. eclipseに「EGradle」のpluginを追加する。
　　　　　　[Help]→[Eclipse MarketPlace]→検索欄に[EGradle]を検索する→[EGradle 2.1.0]をインストールする。
1. IDEにて当プロジェクトをimportする　※Eclipseは[Spring Sts](http://qiita.com/Siro/items/4efea6e9ce6bf2961b36)をインストールしてください
　　※この際、Gradleプロジェクトとしてimportしてください
 ※import時には[EGradle]を使ってimportしてください
1. 「Bash on Ubuntu on Windows」や「Git Bash」等でプロジェクトのルートへ移動後、 `docker-compose build` → `docker-compose up -d`　(DB, Redisが立ち上がる)
→完了

### プロジェクトの起動(Gradle)
コマンドライン:
```sh
gradle bootrun
```

Eclipse
```
実行の構成→bootrunを追加→起動
```

IntelliJ
```
構成の編集→＋ボタン→Gradleを追加→タスクとして bootrun を追加
```
