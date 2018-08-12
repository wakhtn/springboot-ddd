## 最初にすること
- JooQのスキーマ作成
   ```
   $ gradle generateTablesJooqSchemaSource
   ```

- 環境変数の設定
   springのビルドステージを決める。
   ```
   $ export SPRING_PROFILES_ACTIVE=devel
   ```
   このとき、プロパティファイルは、`application-devel.yml`が使われる。
   永続化が必要な場合は、~/.bashrcなどに記載しておくこと。

- 開発用MySQLの起動
   ```
   $ docker-compose up -d
   ```
   MySQLコンテナIPアドレスは、環境によって異なる。
   resources/application-devel.yml及び、build.gradleの内容は適宜書き換えること。

- 起動
   ```
   $ gradle bootRun
   ```
