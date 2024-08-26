- These functions are used to access an object without its name under a temporary scope.
- There are 5 scope functions : 
  - Run
  - Apply
  - With
  - Let
  - Also

<br>

|FunctionName|ObjectReference|ReturnValue|ExtensionFunction|Usage|
|--|--|--|--|--|
|Run|this|lambda result|YES||
|Apply|this|lambda result|YES||
|With|this|lambda result|No: takes the context object as an argument.|Grouping function calls on an object|
|Let|it|context object|YES||
|Also|it|context object|YES||
