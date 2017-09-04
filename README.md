# dcpChat
### 環境構築方法(Mac)
1. [Homebrew](https://brew.sh/index_ja.html)を導入する
1. [Docker](https://www.docker.com/docker-mac)をインストールする
1. brew経由でDocker, Docker-Composeをインストールする。(例：brew install Docker)
1. 当プロジェクトをCloneする
1. IDEにて当プロジェクトをimportする　※Eclipseは[Spring Sts](http://qiita.com/Siro/items/4efea6e9ce6bf2961b36)をインストールしてください
1. ターミナル等でプロジェクトのルートへ移動後、 `docker-compose build` → `docker-compose up -d`　(DB, Redisが立ち上がる)
→完了

### 環境構築方法(Windows)
1. [Docker-ToolBox](https://docs.docker.com/toolbox/toolbox_install_windows/)をインストール　
1. [Bash on Ubuntu on Windows](http://qiita.com/Aruneko/items/c79810b0b015bebf30bb)をインストール→起動
1. 当プロジェクトをCloneする
1. IDEにて当プロジェクトをimportする　※Eclipseは[Spring Sts](http://qiita.com/Siro/items/4efea6e9ce6bf2961b36)をインストールしてください
1. 「Bash on Ubuntu on Windows」や「Git Bash」等でプロジェクトのルートへ移動後、 `docker-compose build` → `docker-compose up -d`　(DB, Redisが立ち上がる)
→完了