#!/usr/bin/env bash
db=db
/mnt/bin/wait-for.sh ${db}:3306 -s -t 60 -- echo "mysql ${db} is up"
basesqldir=/mnt/sql
for sqlfile in `find ${basesqldir}/ -type f -iname '*.sql' | sort`
    do
        echo "SQL ${sqlfile} start executing..."
        mysql -h${db} -P3306 -udev -pdev dev < ${sqlfile}
        if [ 0 -eq $? ];then
            echo "SQL ${sqlfile} executed successfully"
        fi
    done
