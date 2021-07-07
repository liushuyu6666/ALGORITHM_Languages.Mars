# Caveat

## Object in util

### 1, Integer equal

wrong:

```java
Integer a = 1, b = 2;
if(a != b){
    // do something
}
```

right:

```java
Integer a = 1, b = 2;
if(!a.equals(b)){
    // do something
}
```



