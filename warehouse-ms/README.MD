# Warehouse-ms - v0

- Base URL: /warehouses
- POST: create()
- GET: getAll()
- GET / {id} : getById()
- PUT / {id}: update()

## Model

```json
{
  "id": 1,
  "product-id": 1,
  "quantity": 10
}
```

## Business Rules

- Responsável por avisar se um produto está ou não disponível. "quantity = 0 -> outro serviço";
- Não é permitido mais de uma linha do mesmo produto salvo no BD;
