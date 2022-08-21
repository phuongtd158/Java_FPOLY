CREATE DATABASE AssJava4
GO
USE AssJava4
GO

CREATE TABLE [USER](
	id INT PRIMARY KEY IDENTITY,
	username VARCHAR(15) NOT NULL,
	[password] VARCHAR(15) NOT NULL,
	email VARCHAR(50) UNIQUE NOT NULL,
	isAdmin BIT NOT NULL DEFAULT 0,
	isActive BIT NOT NULL DEFAULT 1
)



CREATE TABLE VIDEO(
	id INT PRIMARY KEY IDENTITY,
	title NVARCHAR(255) NOT NULL,
	href VARCHAR(50) UNIQUE NOT NULL,
	poster VARCHAR(255) NULL,
	[views] INT NOT NULL DEFAULT 0,
	share INT NOT NULL DEFAULT 0,
	[description] NVARCHAR(255) NULL,
	isActive BIT NOT NULL DEFAULT 1
)


CREATE TABLE HISTORY(
	id INT PRIMARY KEY IDENTITY,
	userId INT FOREIGN KEY REFERENCES dbo.[USER](id),
	videoId INT FOREIGN KEY REFERENCES dbo.VIDEO(id),
	viewDate DATETIME NOT NULL DEFAULT GETDATE(),
	isLiked BIT NOT NULL DEFAULT 0,
	likedDate DATETIME NULL
)

INSERT INTO dbo.[USER]
(
    username,
    password,
    email,
    isAdmin
)
VALUES
(   'phuongtd',   -- username - varchar(15)
    '123',   -- password - varchar(15)
    'tdphuong2002@gmail.com',   -- email - varchar(50)
    1 -- isAdmin - bit
    ),
(   'phuongtd1',   -- username - varchar(15)
    '123',   -- password - varchar(15)
    'phuongsky1508@gmail.com',   -- email - varchar(50)
    0 -- isAdmin - bit
    )

INSERT INTO dbo.VIDEO
(
    title,
    href,
    description
)
VALUES
(   N'OCEAN - RPT MCK (feat. RPT Orijinn) | Official Music Video', -- title - nvarchar(255)
    'OM_6-e33gaE',  -- href - varchar(50)
    N'Song Title: OCEAN (feat. RPT Orijinn)' -- description - nvarchar(255)
    ),
(   N'Flex - RPT MCK (prod. BINGI) | DEMO', -- title - nvarchar(255)
    '84xznU6OOxg',  -- href - varchar(50)
    N'Flex - RPT MCK (prod. BINGI) | DEMO' -- description - nvarchar(255)
    ),
(   N'Sol7 ft. MCK - iceMan (Prod. Yung Lando, Yung Tago)', -- title - nvarchar(255)
    'ORQB3w-hWRo',  -- href - varchar(50)
    N'Sol7 feat. MCK - iceMan ' -- description - nvarchar(255)
    )

	INSERT INTO dbo.HISTORY
	(
	    userId,
	    videoId,
	    isLiked,
	    likedDate
	)
	VALUES
	(   2,         -- userId - int
	    1,         -- videoId - int
		 1	, -- viewDate - datetime
	      GETDATE()     -- isLiked - bit
	
	    ),
		(   3,         -- userId - int
	    3,         -- videoId - int
		 0	, -- viewDate - datetime
	     null     -- isLiked - bit
	
	    )
SELECT * FROM dbo.[USER]
SELECT * FROM dbo.HISTORY
SELECT * FROM dbo.VIDEO


SELECT * FROM dbo.HISTORY JOIN dbo.[USER] ON [USER].id = HISTORY.userId
						  JOIN dbo.VIDEO ON VIDEO.id = HISTORY.videoId
						  WHERE  [USER].username = 'phuongtd1' 
								 AND VIDEO.isActive = 1 ORDER BY viewDate DESC

