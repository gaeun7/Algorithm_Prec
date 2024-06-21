SELECT info.REST_ID,info.REST_NAME, info.FOOD_TYPE, info.FAVORITES,info.ADDRESS, review_score.SCORE
    FROM (SELECT review.REST_ID, ROUND(AVG(review.REVIEW_SCORE),2) as SCORE 
            FROM REST_REVIEW as review 
            GROUP BY REST_ID) 
            as review_score INNER JOIN  REST_INFO as info   
    ON info.REST_ID = review_score.REST_ID
WHERE info.ADDRESS  LIKE '서울%'
ORDER BY review_score.SCORE DESC , info.FAVORITES DESC;