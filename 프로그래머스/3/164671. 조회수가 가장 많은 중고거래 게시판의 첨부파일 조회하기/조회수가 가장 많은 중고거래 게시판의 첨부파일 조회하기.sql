SELECT CONCAT('/home/grep/src/',B.BOARD_ID,'/',FILE_ID,FILE_NAME,FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD A
    INNER JOIN USED_GOODS_FILE B ON A.BOARD_ID = B.BOARD_ID
WHERE VIEWS = (SELECT MAX(VIEWS)
                FROM USED_GOODS_BOARD)
ORDER BY FILE_ID DESC;