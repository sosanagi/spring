# spring
https://github.com/making/hajiboot-samples

p42. 
@see https://marketplace.visualstudio.com/items?itemName=GabrielBB.vscode-lombok

p47.
追加の方法がよくわからないので、環境構築からやり直しました。
以下3つをDependenciesに追記
- Lombok
- JDBC API
- H2 Database

JPA付近p.72で気づいたけど、前の所もきっと同じ
tableがschema.sqlで作成したものと出来杉のテーブルで別のもの(既にあるテーブルだから勝手に名前をかえる)
@see https://www.baeldung.com/spring-boot-data-sql-and-schema-sql
@see https://teratail.com/questions/124945

ので、同じものだと認識させるための上URLと、AUTO INCREMENTが聞いていないようなので下URL


