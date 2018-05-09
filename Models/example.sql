# 选手相关:
SELECT * FROM player_info;

UPDATE player_info SET total_shot = total_shot + 1 WHERE id = xxx;

DELETE  FROM player_info WHERE id = xxx;

# 球队相关:

SELECT  * FROM team_info;

  # 胜: + 3, 平局 + 1
UPDATE team_info SET integral = integral + 1 WHERE team_id = xxx;

DELETE FROM team_info WHERE team_id = xxx;