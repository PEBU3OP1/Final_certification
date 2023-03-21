import pymysql as sql
from Database.config import host,user,password,db_name




class Farm_db():
    @classmethod
    def get_connection(self) -> sql.Connection:
        try:
            connection = sql.connect(
                    host=host,
                    port=3306,
                    user=user,
                    password=password,
                    database=db_name,
                    cursorclass=sql.cursors.DictCursor
                )

            return connection
        except Exception as ex:
            print("Connection failed")
            print(ex)


    @classmethod
    def getAll(self):

        conn = self.get_connection()
        try:
            with conn.cursor() as cursor:
                select_all = "SELECT * FROM farm;"
                cursor.execute(select_all)
                rows = cursor.fetchall()
                for row in rows:
                    print(row)
                conn.commit()  # важно: для внесения изменений в таблицу

        finally:
            conn.close()

    @classmethod
    def delete(self, id : str):
        conn = self.get_connection()
        try:
            with conn.cursor() as cursor:
                delete_row = f"DELETE FROM farm WHERE Id = {id};"
                cursor.execute(delete_row)
                conn.commit()
                print(f"Животное под номером {id} удалено")
        finally:
            conn.close()