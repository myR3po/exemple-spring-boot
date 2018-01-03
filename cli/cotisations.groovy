@RestController
class CotisationsController {

	@Autowired JdbcTemplate jdbcTemplate;
	RowMapper<Cotisation> rowMapper = {rs,num -> return new Cotisation(
		id:rs.getInt("ID"),
		libelle:rs.getString("LIBELLE"),
		code:rs.getString("CODE"),
		tauxSalarial:rs.getString("tauxSalarial"),
		tauxPatronal:rs.getString("tauxPatronal")
	)}

	@RequestMapping("/")
	List<Cotisation> lister() {
		return this.jdbcTemplate.query("select * from COTISATION", rowMapper)
	}
}