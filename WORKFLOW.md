# Обработка issue
Заведенные issue требуется систематизировать, для этого заполняется информация в дополнительных полях github.
![image](https://user-images.githubusercontent.com/5010169/123955360-b6046400-d9d3-11eb-958c-82d38c378daf.png)
- `Assignee` - указывается исполнитель задачи (либо планируемый либо кто фактически ее сделал);
- `Labels` - указываются лейбл соответствующий типу задачи - баг, улучшение, документация, вопрос и прочее. обязательно должен быть назначен всем задачам, вне зависимости от того когда будет делаться эта задача;
- `Projects` - указывается проект `moko` от организации `icerockdev` (общий проект для всех библиотек);
- `Milestone` - указывается при планировании к разработке либо по факту выполнения задачи. Все закрытые задачи, в которых были изменения в коде, должны быть привязаны к верному milestone;
- `Linked pull requests` - указывается связь на реквесты в которых сделаны изменения касающиеся этой задачи.

# Оформление pull-request'ов
Все pull-request'ы, которые предполагаются к мержу, должны быть оформлены единообразно. Вне зависимости от того откуда контрибьютер (внутренний или внешний). 
![image](https://user-images.githubusercontent.com/5010169/123956154-8efa6200-d9d4-11eb-9fe0-432e9d297a58.png)
- `Reviewers` - указывается ревьювер;
- `Assignee` - указывается ответственный за закрытие реквеста (исполнитель задачи);
- `Labels` - не заполняется (ранее была практика ставить лейблы `backward-compatible` и `backward-incompatible`);
- `Projects` - не заполняется;
- `Milestone` - указывается соответствующий решаемой задаче milestone. Всегда должен быть заполнен (кроме отмененных реквестов);
- `Linked issues` - указывается связь на те задачи, которые решали в данном реквесте.

## Release pull-request
Также для пулреквестов релизов (develop -> master) **обязательно** нужно заполнять описание.  
Должны быть не только номера задач но и краткая суть. То что гитхаб рендерит заголовки в пулреквесте ничего не значит - мы потом это описание копируем в release notes и там никакой отрисовки нет.
Шаблон:
```
# Changes
- #10 some change
- #11 some other change

# Migration
replace `sdsd` to `dsds`.
change X to Y in Z.
```

# Шаблон для описания релиза (в вкладке Releases)
```
# Changes
- #10 some change
- #11 some other change

# Migration
replace `sdsd` to `dsds`.
change X to Y in Z.

# Thanks
@SomeUser
```
По сути тоже самое что для релизного реквеста, но в конце добавляем блок `Thanks` с меншенами внешних контрибьютеров.

# Оформление рабочей ветки
- название ветки должно начинаться с номера issue и далее краткое описание сути.
- pull-request должен идти в `develop`, а не в `master`.
- в каждом коммите указывается номер issue в начале

Пример:
![image](https://github.com/icerockdev/moko/assets/5010169/189335e6-177e-44c9-8ebe-e4b14d1fe6b5)
