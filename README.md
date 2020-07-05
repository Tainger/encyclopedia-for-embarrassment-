## 糗事文档

#### 数据表设计

##### 登录模块

##### user

> id 
>
> user_name 				  用户姓名
>
> header_url				    头像
>
> password	  				密码
>
> phone						    手机号码
>
> email			 				邮箱
>
> status							状态地位
>
> create_time   				创建时间

------

##### user_info

>id
>
>user_id     
>
>age   		                         年龄
>
>sex 									性别
>
>relationship_status        情感状态
>
>job									职业
>
>hometown					   家乡
>
>birthday						   生日

------

##### user_bind

>id                                  
>
>type								第三方类型（微信，微博，QQ，其他）
>
>openid							openid
>
>user_id						（默认是0）
>
>nickname					  第三方昵称
>
>avatar_url					 第三方头像

------

##### 文章分类模块

##### post_category

>id
>
>category				种类
>
>status					状态
>
>create_time		  创建时间

------

##### 话题模块

##### topic_category

>id
>
>category
>
>status
>
>create_time
>
>对应图片的， 推荐

<img src="E:\choushi_app\资料\App截图\动态页\话题分类.png" alt="话题分类" style="zoom:20%;" align="left" />

##### 话题模块

##### topic

>title         				 	标题
>
>title_picture               封面图片
>
>desc       					 描述
>
>type       					  0警用 1启用
>
>create_time      		  创建时间
>
>topic_class_id     		类别

<img src="C:\Users\rocky\AppData\Roaming\Typora\typora-user-images\image-20200705200104415.png" alt="image-20200705200104415  " style="zoom:20%;"  /> 

##### topic_post

>id		         
>
>topic_id      		  话题id
>
>post_id				帖子id
>
>create_time		创建时间
>
>话题和帖子的关联



