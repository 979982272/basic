# basic
spring boot 空项目
1. 项目介绍
center-data-core 与数据库交互模块，该模块代码由CodeGenerator生成，不要在此模块上书写代码
center-data-model 交互实体模块，vo，dto等写在这里
center-data-rest 与外界交互模块，业务写在这个模块里；独立的service如果修改到与数据库交互的模块
在这个模块下建立新的，这么做的原因是要保护由代码生成模块的纯净，在发生需要修改数据库字段的时候可以直接重新生成
2. 生成代码解释
2.1 代码生成之后需要install对应的模块
2.2 生成代码由CodeGenerator类操作；需要在控制台输入需要生成的模块与表
2.3 控制带要求输入一下两个参数:
模块名->类似center-data-core中的emp包
表名，多个英文逗号分割->表名
3. 项目启用
以main方式运行BootApplication