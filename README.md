

## 糗事文档

### 数据表设计

#### 登录模块

##### user

> id 
>
> name 				  用户姓名
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

#### 文章模块

##### post_category

>id
>
>name    				种类
>
>status					状态
>
>create_time		  创建时间

------

#### 话题模块

##### topic_category

>id							
>
>name
>
>status  0警用 1启用
>
>create_time
>
>对应图片的， 推荐

<img src="E:\choushi_app\资料\App截图\动态页\话题分类.png" alt="话题分类" style="zoom:20%;" align="left" />

------

##### topic

>id
>
>name        				 	标题
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

------

##### topic_post

>id		         
>
>topic_id      		  话题id
>
>post_id				帖子id
>
>create_time		创建时间
>
>​							话题和帖子的关联

------

#### 搜索框

<img src="E:\choushi_app\资料\App截图\搜索\搜索页-结果.png" alt="搜索页-结果" style="zoom:25%;" align="left"/><img src="E:\choushi_app\资料\App截图\搜索\搜索页.png" alt="搜索页" style="zoom:25%;" align="left" />































#### 首页

- 图文
- 视频

<img src="E:\choushi_app\资料\App截图\首页\首页-视频.png" alt="首页-视频" style="zoom:25%;" align="left" />

#### 小纸条

<img src="E:\choushi_app\资料\App截图\小纸条\小纸条.png" alt="小纸条" style="zoom:25%;" align="left" />

<img src="E:\choushi_app\资料\App截图\小纸条\聊天页.png" alt="聊天页" style="zoom:25%;" align="left"/>

#### 登陆

- 手机号码登陆
- 微信，企鹅，微博登陆

<img src="E:\choushi_app\资料\App截图\登录\登录页-手机登录.png" alt="登录页-手机登录" style="zoom:25%;" align="left" />

#### 关注

- 两种关注

<img src="E:\choushi_app\资料\App截图\动态页\动态-关注2.png" alt="动态-关注2" style="zoom:25%;" align="left"/>

#### 发布页

<img src="E:\choushi_app\资料\App截图\发布页\发布页-弹窗.png" alt="发布页-弹窗" style="zoom:25%;" /><img src="E:\choushi_app\资料\App截图\发布页\发布页.png" alt="![发布页-弹窗](E:\choushi_app\资料\App截图\发布页\发布页-弹窗.png)发布页" style="zoom: 25%;" align="left"/>

#### 个人空间

<img src="E:\choushi_app\资料\App截图\个人空间\个人空间-首页.png" alt="个人空间-首页" style="zoom:25%;" /><img src="E:\choushi_app\资料\App截图\个人空间\个人空间-菜单.png" alt="个人空间-菜单" style="zoom:25%;" align="left"/>

#### 好友列表

<img src="E:\choushi_app\资料\App截图\好友列表\好友列表-粉丝.png" alt="好友列表-粉丝" style="zoom:25%;" align="left"/>

<img src="E:\choushi_app\资料\App截图\好友列表\好友列表-互关.png" alt="好友列表-互关" style="zoom:25%;" align="left"/>



#### 内容页

#### <img src="E:\choushi_app\资料\App截图\内容页\内容页-分享.png" alt="内容页-分享" style="zoom: 25%;" />



<img src="E:\choushi_app\资料\App截图\内容页\内容页-视频.png" alt="内容页-视频" style="zoom:25%;" align="left"/>

<img src="E:\choushi_app\资料\App截图\内容页\内容页-图文.png" alt="内容页-图文" style="zoom:25%;" align="left"/>

#### 设置

- 设置模块包含很多信息

<img src="E:\choushi_app\资料\App截图\设置\设置.png" alt="设置" style="zoom:25%;" align="left"/><img src="E:\choushi_app\资料\App截图\设置\设置-关于.png" alt="设置-关于" style="zoom:25%;" align="left"/><img src="E:\choushi_app\资料\App截图\设置\设置-修改密码.png" alt="设置-修改密码" style="zoom:25%;" align="left"/>

<img src="E:\choushi_app\资料\App截图\设置\设置-修改邮箱.png" alt="设置-修改邮箱" style="zoom:25%;" align="left"/><img src="E:\choushi_app\资料\App截图\设置\设置-修改资料.png" alt="设置-修改资料" style="zoom:25%;" align="left"/><img src="E:\choushi_app\资料\App截图\设置\设置-意见反馈.png" alt="设置-意见反馈" style="zoom:25%;" align="left"/>



