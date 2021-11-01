# Translatoinator

App to randomly translate word through different languages

## API
``URL: http://grzybek.snet.ovh:8080``

### POST /randomTranslate
```
Headers:
Content-Type application/json

Body:
{"word": <word to translate>, "repeat": <times to repeat translation>}
``` 
