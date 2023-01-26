# Products ms - v0

## Endpoints

- Base URL: /products
- POST: create()
- GET: getAll()
- GET / {id} : getById()
- PUT / {id}: update()
- DELETE / {id}: delete()

## Model

```json
{
  "id": 1,
  "name": "Iphone 13 Pro Max",
  "description": "Nova geração apple",
  "price": 6999.9,
  "isAvailable": true
}
```

## Business Rules

- Só é possivel a criação de produtos com preço positivo;
- Não é possivel pesquisar produtos que não estão disponíveis;
- Não é possivel inserir descrições com menos de 50 caracteres;
